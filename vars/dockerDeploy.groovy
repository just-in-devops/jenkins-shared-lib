# Deploy and start docker compose
def deploy(env) {
    sh """
      ssh -o StrictHostKeyChecking=no ec2-user@ '
        docker-compose -f docker-compose..yml up -d
      '
    """
}
return this
