public class HostParams {
    private String hostIp = "127.0.01";
    private int sshPort = 22;
    private String usr = "root";
    private String pwd = "passwd";
    private String identity = "~/.ssh/id_rsa";
    private String passphrase = "";

    public HostParams(String hostIp, String usr, String pwd) {
        this.hostIp = hostIp;
        this.usr = usr;
        this.pwd = pwd;
    }

    public HostParams(String hostIp, int sshPort, String usr, String pwd, String identity, String passphrase) {
        this.hostIp = hostIp;
        this.sshPort = sshPort;
        this.usr = usr;
        this.pwd = pwd;
        this.identity = identity;
        this.passphrase = passphrase;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public int getSshPort() {
        return sshPort;
    }

    public void setSshPort(int sshPort) {
        this.sshPort = sshPort;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    @Override
    public String toString() {
        return "HostParams{" +
                "hostIp='" + hostIp + '\'' +
                ", sshPort=" + sshPort +
                ", usr='" + usr + '\'' +
                ", pwd='" + pwd + '\'' +
                ", identity='" + identity + '\'' +
                ", passphrase='" + passphrase + '\'' +
                '}';
    }
}
