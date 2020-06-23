# Cost to install Fence

You've just been hired by Alton's Hardware Store. Your job is to develop a tool which will allow his customers to calculate the cost for installing a fence. Start by determining the algorithm to calculate the cost of installing the fence for 500 ft by 720 ft yard.

Create a program that will calculate the cost with tax of fencing a rectangular yard, where the size of a yard is provided by a user. The cost of the fencing will depend on the amount of fencing required (the perimeter of the yard), and the type of fencing used so compute the cost for both types of fence. A gate must be installed  for an additional cost. 

Prices (including installation)

    Wooden fencing costs $25 per foot
    Chain-link fencing costs $15 per foot
    Gates cost $150. 
    A building permit is required. It costs $50.00.
    The tax rate is 6.0% but it doesn't apply to the building permit

Algorithm for 500 ft by 720 ft:

    perimeter = (500*2 + 720*2)
    totalCost = ((perimeter(25+15) + 150) * 1.06) + 50
    
Pseudocode:

    BEGIN
    
        PROMPT: Input the width of the rectangular yard in foot
        Get the width
        PROMPT: Input the length of the rectangular yard in foot
        Get the length
   
        perimeter = (2*with) + (2*length)
        woodenFenceCost = 25 * perimeter
        chainLinkCost = 15 * perimeter
        gateCost = 150
        buildingPermit = 50
        addedCost = (woodenFenceCost + chainLinkCost + gateCost)
        totalFenceCost = (addedCost * 1.06) + buildingPermit
        
        Display: totalFenceCost
    END