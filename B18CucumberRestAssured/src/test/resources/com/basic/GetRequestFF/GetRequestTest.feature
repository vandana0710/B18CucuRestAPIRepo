Feature: First Rest Assured test22

  
Scenario: Test my Get Method22
Given user start the rest assured test  
When user hit the get request
Then user checks the count or size
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0] with the "albert_park" vlue