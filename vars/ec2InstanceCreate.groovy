def create() {
    sh 'bash create-ec2-with-env.sh ${COMPONENT} ${ENV}'
}
