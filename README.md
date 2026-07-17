This below pipeline file is for jenkins for this project

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

@Library("shared") _
pipeline{
    agent {label "binod"}
    
    stages{
        stage("Hello"){
            steps{
                script{
                    hello()
                }
            }
        }
        
        stage("Code"){
            steps{
                script{
                    code("https://github.com/Kaushal1978/django-notes-app", "main")
                }
            }
        }
        stage("Build"){
            steps{
                script{
                     Dockerbuild()
                }
            }
        }
        stage("pushing image to docker hub"){
           steps{
                script{
                    push()
                }
            }
        }    
        stage("Deploy"){
            steps{
                script{
                    deploy()
                }
            }
        }
    }
}
