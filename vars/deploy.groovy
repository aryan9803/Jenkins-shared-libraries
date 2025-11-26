 def call(String DOCKER_NAME)
{
  echo 'Stopping and removing any old container using port 8000...'
                sh 'docker stop $(docker ps -q --filter publish=8000) || true'
                sh 'docker rm $(docker ps -a -q --filter publish=8000) || true'
                
                echo 'Starting new container...'
                // Note: We use the locally built image for deployment here.
                sh "docker run -d -p 8000:8000 ${DOCKER_NAME}

                echo 'Deployment Complete' 
}
