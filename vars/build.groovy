def call(){
  echo "building"
  sh "docker build -t notes-app:latest ."
  echo "build successfully"
}
