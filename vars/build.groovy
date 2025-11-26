def call(String DOCKERHUB_IMAGE)
{

sh "docker build --no-cache -t simple-app:latest ."
 echo 'Code Built Successfully'


sh "docker tag simple-app:latest "${DOCKERHUB_IMAGE}":latest"
echo "Image tagged as "${DOCKERHUB_IMAGE}":latest"

}
