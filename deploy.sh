mvn clean package
scp /media/radek/Disk/dev/uploader/target/uploader-1.0.jar deployer@192.168.0.42:/opt/apps/uploader/
ssh deployer@192.168.0.42 sudo systemctl restart uploader
