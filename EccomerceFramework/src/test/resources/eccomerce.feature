Feature: E-Commerce Flow

Scenario Outline: Complete shopping flow

Given User launches browser
When User login using "<username>" and "<password>"
And User searches product
And User adds product to cart
Then User proceeds to checkout

Examples:
| username | password |
| standard_user   | secret_sauce |