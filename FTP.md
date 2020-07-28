#linux安装ftp 

##yum 安装vsftpd

关闭 seliux

关闭 防火墙

##配置/etc/vsftpd/vsftpd.conf文件

```xml
    anonymous_enable=NO  #匿名配置
    
    local_enable=YES     #本地用户登录
    
    write_enable=YES     #全局写入配置
    
    local_umask=022      #默认本地用户登录权限
    
    local_root=/var/ftp/pub  #本地用户登录文件目录
    
    dirmessage_enable=YES   
    
    xferlog_enable=YES     #日志输出
    
    connect_from_port_20=YES   #连接端口
    
    xferlog_std_format=YES   #是否格式化日志输出
    
    listen=NO
    
    listen_ipv6=YES
    
    pam_service_name=vsftpd   #pam认证，/etc/pam.d/vsftpd  配置文件
    
    userlist_enable=YES       #开启用户列表功能   ftpuser为黑名单   userlist为白名单
    
    tcp_wrappers=YES
    
    ######################
    #reverse_lookup_enable=NO
    
    chroot_local_user=YES
    
    anon_world_readable_only=YES   
    
    anon_other_write_enable=YES
    
    #local_other_write_enable=YES
    
    anon_mkdir_write_enable=YES
    
    allow_writeable_chroot=YES
    
    #force_local_logins_ssl=YES
    
    #allow_anon_ssl=NO
    
    #ssl_enable=YES

```
相关命令行

```play
    systemctl restart vsftpd

    firewalld的基本使用
    
    启动： systemctl start firewalld
    
    查看状态： systemctl status firewalld 
    
    停止： systemctl disable firewalld
    
    禁用： systemctl stop firewalld
```
