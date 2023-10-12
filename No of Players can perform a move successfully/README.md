There are N players standing in a row, one player on a field. They are numbered from 0 to N−1 from left to right. Players perform moves one by one from left to right, that is, in ascending order of numbers. Each player presses an arrow key in one of the four cardinal left ('<'), right ('>'), up ('^') or down ('v'). A key press in the given direction means that the player attempts to move onto the closest field in the direction specified. A move can be performed only if there is no other player already standing on the target field. Moves are represented as a string S of length N, where S[K] (for K within the range 0.N−1 ) is the direction of the K-th player's move. How many players will actually perform a move successfully? 
 
 Write a function: class Solution { public int solution(String S); } which, given a string S of length N representing arrow keys pressed by each of the players, returns the number of players that will perform a move successfully. 
 
 Examples: 
 1. Input S = "><^v"
    Output = 2
    Explaination - Player 0 and 1 cannot move. Players 2 and 3 can perform their actions as no other player is standing in their direction of movement
 
 2. Input S= "<<^<v>>",
    Output  6

 3. Input S = "><><"
    Output = 0 
