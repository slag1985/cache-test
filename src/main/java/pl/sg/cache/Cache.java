package pl.sg.cache;

import lombok.NonNull;

import java.util.Optional;

public interface Cache {

    enum RemovalStatus {
        REMOVED, NOT_FOUND
    }

    Optional<String> getValue(@NonNull String key);

    void setValue(@NonNull String key, @NonNull String value);

    RemovalStatus removeValue(@NonNull String key);

    void reset();
}
