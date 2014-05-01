package org.btc4all.webfinger.webfist;

/**
 * @author Kosta Korenkov <7r0ggy@gmail.com>
 */
public interface ProofValidator {

    void validate(String resource, String proofLink) throws ProofValidationException;
}
