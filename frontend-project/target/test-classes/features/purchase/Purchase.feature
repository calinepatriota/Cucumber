@Frontend

Feature: Samsung Web Testing

@Purchase
  Scenario: Purchase flow until defining payment information
    Given Homepage has been loaded
    When search a product
    And choose buy the product and fill personal credentials
    Then Validate that Free Shipping

@ListSmartphones
  Scenario: Print the smartphones name
    Given Homepage has been loaded
    When click on meunuBar Telefonia
    And Choose Menor preco filter 
    Then Validate all smartphones are visible as filter
    
@FAQOnline
  Scenario: Print ship information available in the FAQ
    Given Homepage has been loaded
    When click on FAQ Loja Online link
    And click Entrega link
    Then Print the third question presented and the answer of this question
    