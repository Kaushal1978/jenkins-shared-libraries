This below pipeline file is for jenkins for this project

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
               code()
            }
        }
        stage("Build"){
            steps{
                build()
            }
        }
        stage("pushing image to docker hub"){
           steps{
                push()
            }
        }    
        stage("Deploy"){
            steps{
                deploy()
            }
        }
    }
}
