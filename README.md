Configuration needed in AWS instance in order to allow github-aws-jenkins interaction:

1- Install docker in aws instance.

2- Execute the following commands:

$ sudo groupadd docker
$ sudo usermod -aG docker $USER

$ sudo chmod 777 /var/run/docker.sock
$ sudo usermod -a -G docker jenkins

Then restart jenkins:
http://<jenkins url>/restart
  
3- Stop a job (from script console)

Jenkins.instance.getItemByFullName("JobName")
                .getBuildByNumber(JobNumber)
                .finish(
                        hudson.model.Result.ABORTED,
                        new java.io.IOException("Aborting build")
                );
                
                
4- In case docker daemon is stop execute:
systemctl start docker
o sino:
sudo service docker start

5-
$ newgrp docker
