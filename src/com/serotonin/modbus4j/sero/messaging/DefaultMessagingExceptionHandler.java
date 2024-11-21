package com.serotonin.modbus4j.sero.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>DefaultMessagingExceptionHandler class.</p>
 *
 * @author Matthew Lohbihler
 * @version 5.0.0
 */
public class DefaultMessagingExceptionHandler implements MessagingExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(DefaultMessagingExceptionHandler.class);
    /** {@inheritDoc} */
    public void receivedException(Exception e) {
        log.error(e.getMessage(), e);
    }
}
