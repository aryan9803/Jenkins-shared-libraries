def call(String DOCKERHUB_IMAGE , String DOCKER_NAME)
{

sh "docker build --no-cache -t "${DOCKER_NAME}" ."
 echo 'Code Built Successfully'


sh "docker tag simple-app:latest "${DOCKERHUB_IMAGE}":latest"
echo "Image tagged as "${DOCKERHUB_IMAGE}":latest"

}
