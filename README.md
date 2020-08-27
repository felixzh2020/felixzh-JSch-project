# felixzh-JSch-project
http://www.jcraft.com/jsch/
JSch会优先使用填入的ssh_key尝试登陆，尝试失败后才会使用password登陆

# JSch - Java Secure Channel
JSch is a pure Java implementation of SSH2.
JSch allows you to connect to an sshd server and use port forwarding, X11 forwarding, file transfer, etc., and you can integrate its functionality into your own Java programs. 
JSch is licensed under BSD style license.

# Why JSch?
Originally, our motivation to develop this stuff is to allow users of our pure java X servers, WiredX, to enjoy secure X sessions. So, our efforts had mostly targeted to implement the SSH2 protocol for X11 forwarding. Of course, however, we are now also interested in adding other functionality like port forward, file transfer, terminal emulation, etc.

# SSH2
Needless to say, SSH provides support for secure remote login, secure file transfer, and secure TCP/IP and X11 forwarding. It can automatically encrypt, authenticate, and compress transmitted data. The SSH protocol is available in two incompatible varieties: SSH1 and SSH2. SSH2 was invented to avoid the patent issues regarding RSA (RSA patent has expired), and to fix some data integrity problem that SSH1 has, and for a number of other technical reasons. SSH2 protocol has been standardized on IETF Secure Shell working group and drafts related to SSH2 protocol are available on the web. In developing JSch, we are now referring to following documents:

SSH Protocol Architecture
SSH Transport Layer Protocol
Diffie-Hellman Group Exchange for the SSH Transport Layer Protocol
SSH Connection Protocol
SSH Authentication Protocol

# Features
The current JSch has the following features.

JSch is in pure Java, but it depends on JavaTM Cryptography Extension (JCE). JSch has been known to work with:
J2SE 1.4.0 or later (no additional libraries required).
J2SE 1.3 and Sun's JCE reference implementation that can be obtained at http://java.sun.com/products/jce/.
J2SE 1.2.2 and later and Bouncycastle's JCE implementation that can be obtained at http://www.bouncycastle.org/.
SSH2 protocol support.
Key exchange: diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521
Cipher: blowfish-cbc,3des-cbc,aes128-cbc,aes192-cbc,aes256-cbc,aes128-ctr,aes192-ctr,aes256-ctr,3des-ctr,arcfour,arcfour128,arcfour256
MAC: hmac-md5, hmac-sha1, hmac-md5-96, hmac-sha1-96
Host key type: ssh-dss,ssh-rsa,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521
Userauth: password
Userauth: publickey(DSA,RSA,ECDSA)
Userauth: keyboard-interactive
Userauth: gssapi-with-mic
X11 forwarding
xauth spoofing
connection through HTTP proxy.
connection through SOCKS5 proxy.
port forwarding.
stream forwarding.
signal sending. The unofficial patch for sshd of openssh will be found in this thread.
envrironment variable passing.
remote exec.
generating DSA and RSA key pairs.
supporting private keys in OpenSSL(traditional SSLeay) and PKCS#8 format.
changing the passphrase for a private key.
partial authentication
SSH File Transfer Protocol(version 0, 1, 2, 3)
packet compression: zlib, zlib@openssh.com JZlib has been used.
hashed known_hosts file.
NONE Cipher switching. High Performace Enabled SSH/SCP supports NONE Cipher switching. Refer to ScpToNoneCipher.java.
JSch is licensed under BSD style license.

# How To Try
The downloadable archive includes the source code of JSch and some examples. For example, current archive includes a simple Java program, which demonstrates X11 forwarding. Please refer to '/examples/README' file. Here are examples included in the current archive.


# Applications using JSch
We have recognized that the following applications have used JSch.

Ant(1.6 or later).
JSch has been used for Ant's sshexec and scp tasks.
Eclipse(3.0).
Our Eclipse-CVSSSH2 plug-in has been included in Eclipse SDK 3.0. This plug-in will allow you to get ssh2 accesses to remote CVS repository by JSch.
NetBeans 5.0(and later)
Jakarta Commons VFS
Maven Wagon
Rational Application Devloper for WebSphere Software
HP Storage Essentials
JIRA
Trac WikiOutputStreamPlugin

# Download
jsch-0.1.55.zip(369,664 bytes)
md5sum:    6409f5c38840b053d946fb17cc3f2400   jsch-0.1.55.zip
jsch-0.1.55.jar(280,681 bytes)
md5sum:    aaa0a466d11ad1538f8b89b864a08a39   jsch-0.1.55.jar


