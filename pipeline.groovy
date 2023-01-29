pipeline
  agent any{
     stages{
        stage{
            step{
                sh.jenkins env 
            }
        }
     }
  }