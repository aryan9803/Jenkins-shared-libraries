def call(String DOCKERHUB_CREDENTIAL_ID)
{ 
  // Uses the defined DOCKERHUB_CREDENTIAL_ID to authenticate
                    withCredentials([usernamePassword(
                        credentialsId: "$DOCKERHUB_CREDENTIAL_ID", 
                        passwordVariable: 'DOCKER_PASSWORD', 
                        usernameVariable: 'DOCKER_USERNAME'
                    )]) {
                        sh "echo \$DOCKER_PASSWORD | docker login -u \$DOCKER_USERNAME --password-stdin"
                        echo "Successfully logged into Docker Hub."
                    }
}
