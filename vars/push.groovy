def call(String DOCKERHUB_IMAGE)
{
    sh "docker push "${DOCKERHUB_IMAGE}":latest"
    echo "Image Pushed to Docker Hub: "${DOCKERHUB_IMAGE}":latest"
}
