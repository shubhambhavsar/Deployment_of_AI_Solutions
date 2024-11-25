pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'python3 -m pip install -r requirements.txt'
            }
        }
        stage('Test') {
            steps {
                bat 'pytest'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t deployment_app .'
            }
        }
        stage('Deploy to Minikube') {
            steps {
                bat 'kubectl apply -f k8s/deployment.yaml'
            }
        }
    }
}

