def call(){
  echo "deploying"
  sh "docker compose up -d"
  echo "deployed successfully"
}
