package com.github.openspaceapp.jbe.domain.port;

import com.github.openspaceapp.jbe.domain.model.SheetImport;

import java.util.Optional;

public interface SheetImporter {

    Optional<SheetImport> get(String identifier);

}