def call(){
  withCredentials([
      usernamePassword(
          credentialsId: 'DockerHubCredentials',
          usernameVariable: 'dockerHubUser',
          passwordVariable: 'dockerHubPass'
      )
      ]) {
            sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
            sh "docker image tag notes-app:latest kaushal20/notes-app:latest"
            sh "docker push kaushal20/notes-app:latest"
            echo "pushed successfully"
          }
}       
