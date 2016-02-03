/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.ldap.server.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IdentityIOStreamUtils {

    private static final Log log = LogFactory.getLog(IdentityIOStreamUtils.class);

    public static void closeAllStreams(InputStream input, OutputStream output){
        closeInputStream(input);
        closeOutputStream(output);
    }

    public static void closeInputStream(InputStream input) {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException ioe) {
            log.error("Error occurred while closing Input stream");
        }
    }

    public static void closeOutputStream(OutputStream output) {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioe) {
            log.error("Error occurred while closing Output stream");
        }
    }

    public static void flushOutputStream(OutputStream output) {
        try {
            if (output != null) {
                output.flush();
            }
        } catch (IOException ioe) {
            log.error("Error occurred while flushing Output stream");
        }
    }
}
