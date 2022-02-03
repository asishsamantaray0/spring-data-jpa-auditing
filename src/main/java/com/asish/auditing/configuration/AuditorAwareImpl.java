package com.asish.auditing.configuration;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

/**
 * Set the Author name in the getCurrentAuditor() method.
 *
 * @author asish.samantaray
 */
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Asish Samantaray");
    }
}
