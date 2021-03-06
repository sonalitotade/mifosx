package org.mifosng.platform.exceptions;

/**
 * A {@link RuntimeException} thrown when loan transactions processing strategy resources are not found.
 */
public class LoanTransactionProcessingStrategyNotFoundException extends AbstractPlatformResourceNotFoundException {

	public LoanTransactionProcessingStrategyNotFoundException(final Long id) {
		super("error.msg.transactions.processing.strategy.id.invalid", "Loan transaction processing strategy with identifier " + id + " does not exist", id);
	}
}