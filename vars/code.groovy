def call(){
     echo "cloning"
     git url: "${url}", branch: ${branch}
     echo "git branch cloned successfully"
}
