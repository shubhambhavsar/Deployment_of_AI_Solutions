pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat '"C:\\Users\\user\\AppData\\Local\\Programs\\Python\\Python313\\python.exe" -m pip install -r requirements.txt'
            }
        }
        stage('Test') {
            steps {
                bat '"C:\\Users\\user\\AppData\\Local\\Programs\\Python\\Python313\\python.exe" -m pytest'
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
