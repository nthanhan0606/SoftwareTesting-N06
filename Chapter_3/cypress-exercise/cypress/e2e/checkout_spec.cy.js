describe('Checkout - Proceed to Confirmation Step', () => {
  beforeEach(() => {
    // Login
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();

    // Verify successful login
    cy.url().should('include', '/inventory.html');
  });

  it('Should proceed to checkout confirmation step with valid information', () => {
    // Add first product to cart
    cy.get('.inventory_item')
      .first()
      .find('button')
      .contains('Add to cart')
      .click();

    // Navigate to cart
    cy.get('.shopping_cart_link').click();
    cy.url().should('include', '/cart.html');

    // Proceed to checkout
    cy.get('#checkout').click();
    cy.url().should('include', '/checkout-step-one.html');

    // Fill checkout information
    cy.get('#first-name').type('John');
    cy.get('#last-name').type('Doe');
    cy.get('#postal-code').type('12345');

    // Continue to confirmation step
    cy.get('#continue').click();

    // Verify redirect to checkout confirmation page
    cy.url().should('include', '/checkout-step-two.html');
  });
});
