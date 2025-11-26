# Terraform workflow commands
def init() {
    sh "terraform init -input=false"
}

def plan(env) {
    sh "terraform plan -var-file=infra/env/.tfvars -out=tfplan"
}

def apply() {
    sh "terraform apply -auto-approve tfplan"
}

return this
