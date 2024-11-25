# Data Analytics Application

The project showcases containerization using Docker, CI/CD pipeline automation with Jenkins, and Kubernetes orchestration with Minikube. The repository also includes automated testing for application reliability.

## Features
- **Containerization:** The application is containerized using Docker for consistent deployments.
- **CI/CD Automation:** Jenkins pipelines automate the build, test, and deployment processes.
- **Kubernetes Deployment:** Kubernetes YAML files manage the deployment and services on Minikube.
- **Configuration Management:** Ansible playbooks automate server setup and application deployment.
- **Testing Framework:** Automated testing with Pytest ensures application robustness.

## Repository Structure
```
├── ansible # Ansible playbooks for configuration management 
│ ├── deploy.yaml # Deployment playbook 
│ └── inventory.ini # Ansible inventory file 
├── data # Data files for the AI application 
│ └── sample.csv 
├── k8s # Kubernetes YAML configurations 
│ ├── deployment.yaml # Kubernetes deployment configuration 
│ └── service.yaml # Kubernetes service configuration 
├── src # Source code of the AI application 
│ ├── app.py # Flask application 
│ ├── analysis.py # Data analysis script 
├── tests # Pytest test scripts 
│ └── test_analysis.py 
├── deployment_app.dockerfile # Dockerfile for building the application 
├── Jenkinsfile # Jenkins pipeline for CI/CD 
├── requirements.txt # Python dependencies 
├── README.md # Documentation
```

## Getting Started

### Prerequisites
- Python 3.8 or higher
- Docker
- Minikube
- Jenkins

### Installation
Clone the repository:
   ```bash
   git clone https://github.com/shubhambhavsar/Deployment_of_AI_Solutions.git

### Set Up Python Environment
Create a virtual environment and activate it:
```bash
python3 -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate
```

Install the necessary dependencies:
```bash
pip install -r requirements.txt
```

### 3. Run the Application Locally
Start the Flask application:
```bash
python src/app.py
```

Now you can access the application by visiting [http://127.0.0.1:5000](http://127.0.0.1:5000) in your browser.

## Containerization with Docker

### Build the Docker Image
To containerize the application, run the following command:
```bash
docker build -t data-analytics-app .
```

### Run the Docker Container
Once the image is built, run the container:
```bash
docker run -p 5000:5000 data-analytics-app
```

## CI/CD Pipeline with Jenkins

### Set Up Jenkins
1. Install Jenkins on your local machine.
2. Install the required plugins, such as Docker and GitHub.

### Define the Pipeline
The provided `Jenkinsfile` defines the build, test, and deploy stages. You can modify it based on your needs.

### Run the Pipeline
In Jenkins, configure a new pipeline job pointing to this GitHub repository and trigger the pipeline to automate the process.

## Kubernetes Deployment with Minikube

### Start Minikube
To start the Minikube local cluster, run:
```bash
minikube start
```

### Deploy the Application to Kubernetes
Apply the Kubernetes manifests to deploy the app:
```bash
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```

### Access the Application
Retrieve the Minikube IP to access the application:
```bash
minikube ip
```
Visit the provided IP in your browser.

## Testing

To run the unit tests using Pytest, execute the following:
```bash
pytest tests/
```

Ensure all tests pass successfully.