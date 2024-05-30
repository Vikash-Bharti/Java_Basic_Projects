# Java_Basic_Project ( Rock_Scissor_Paper Game)
This is a 'Rock Paper Scissor' game using java basic(Consitional Statement).
----------------------------------------------------------------------------
U = User can choose -> Rock / Scissor / Paper 
C = Computer can choose Random any one -> Rock / Scissor / Paper

Condition for Win : Rock > Scissor > Paper

User win : 
  if( U(Rock) && C(Scissor) || U(Scissor) && C(Paper) || U(Paper) && C(Rock) )
  
Computer Win (Random Choose):
  if( U(Rock) && C(paper) || U(paper) && C(Scissor) || U(Scissor) && C(Rock) )

Game Draw!
  if(User == Computer)
