package com.jaguzz.persona.persona_api.config;

import org.hibernate.envers.RevisionListener;

import com.jaguzz.persona.persona_api.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @SuppressWarnings("unused")
    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;

    }


}
