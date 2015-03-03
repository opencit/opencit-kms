/*
 * Copyright (C) 2014 Intel Corporation
 * All rights reserved.
 */
package com.intel.kms.api;

/**
 * The RegisterKeyResponse contains either key attributes and a link to the
 * registered key, or any faults that prevented the key from being registered. 
 * The RegisterKeyResponse never includes the created key itself.
 *
 * @author jbuhacoff
 */
public class RegisterKeyResponse extends AbstractResponse {
    /**
     * Complete set of attributes for the created key; this will
     * reflect attributes specified by the client including any
     * server overrides to these, as well as any attributes added
     * automatically by the server.
     * This is equivalent to the attributes that would be received
     * if the client were to issue a request to /keys/{keyId} for
     * its attributes, and is intended for the client to avoid making
     * the extra request.
     */
//    public KeyAttributes attributes;
    
}