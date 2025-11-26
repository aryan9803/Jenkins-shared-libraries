def call(String DOCKERHUB_IMAGE , String DOCKER_NAME)
{
    // The DOCKER_NAME should be the local name (e.g., simple-app:latest)
    sh "docker build --no-cache -t ${DOCKER_NAME} ." 
    echo 'Code Built Successfully'

    // The image to tag (simple-app:latest) is used to create the hub image tag
    // Note: The simple-app:latest tag MUST exist locally from the build step above.
    sh "docker tag simple-app:latest ${DOCKERHUB_IMAGE}:latest"
    echo "Image tagged as ${DOCKERHUB_IMAGE}:latest"
}
