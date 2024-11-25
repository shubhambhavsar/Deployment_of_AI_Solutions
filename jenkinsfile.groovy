pipeline {
    agent any
    stages {
        stage('Build') {
            steps { sh 'pip install -r requirements.txt' }
        }
        stage('Test') {
            steps { sh 'pytest' }
        }
        stage('Docker Build') {
            steps { sh 'docker build -t deployment_app .' }
        }
        stage('Deploy to Minikube') {
            steps { sh 'kubectl apply -f k8s/deployment.yaml' }
        }
    }
}
