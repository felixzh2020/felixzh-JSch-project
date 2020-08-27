import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class SSHLoginMain {
    public static void main(String[] args) throws Exception {
        HostParams hostParams = new HostParams("172.29.1.149", "root", "passwd");
        Session session = getSession(hostParams);
        session.connect(50_000);

        if (session.isConnected()) {
            System.out.println("Host(" + hostParams.getHostIp() + ") connected.");
        }

        session.disconnect();
    }

    public static Session getSession(HostParams hostParams) throws JSchException {
        JSch jSch = new JSch();
        if (Files.exists(Paths.get(hostParams.getIdentity()))) {
            jSch.addIdentity(hostParams.getIdentity(), hostParams.getPassphrase());
        }
        Session session = jSch.getSession(hostParams.getUsr(), hostParams.getPwd(), hostParams.getSshPort());
        session.setPassword(hostParams.getPwd());
        Properties properties = new Properties();
        properties.put("StrictHostKeyChecking", "no");
        session.setConfig(properties);
        return session;
    }
}
