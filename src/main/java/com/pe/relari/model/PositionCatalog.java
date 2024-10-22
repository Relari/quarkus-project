package com.pe.relari.model;

import lombok.Getter;

public enum PositionCatalog {

    DEVELOPER("developer"),
    MANAGER("manager"),
    ARCHITECT("architect"),
    SCRUM_MASTER("scrum-master"),
    TEAM_LEAD("team-lead");
    
    @Getter
    private final String value;
    
    PositionCatalog(String value) {
        this.value = value;
    }
    
}
