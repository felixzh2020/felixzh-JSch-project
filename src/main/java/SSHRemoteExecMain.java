import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SSHRemoteExecMain {
    public static void main(String[] args) throws Exception {
        HostParams hostParams = new HostParams("127.0.0.1", "root", "passwd");
        Session session = SSHLoginMain.getSession(hostParams);
        session.connect(50_000);

        if (session.isConnected()) {
            System.out.println("Host(" + hostParams.getHostIp() + ") connected.");
        }

        rmtExec(session, "pwd");

        session.disconnect();
    }

    public static List<String> rmtExec(Session session, String cmd) throws JSchException {
        List<String> resLines = new ArrayList<>();
        ChannelExec channel = null;
        try {
            channel = (ChannelExec) session.openChannel("exec");
            channel.setCommand(cmd);
            InputStream inputStream = channel.getInputStream();
            channel.connect(50_000);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String inputLine;
                while ((inputLine = bufferedReader.readLine()) != null) {
                    System.out.println(inputLine);
                    resLines.add(inputLine);
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (channel != null) {
                try {
                    channel.disconnect();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return resLines;
    }
}
