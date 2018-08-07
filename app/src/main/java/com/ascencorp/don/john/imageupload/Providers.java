package com.ascencorp.don.john.imageupload;

public class Providers {

    public enum PROVIDER_NAME {

        GOOGLE_DRIVE("GOOGLE_DRIVE"),
        DROPBOX("DROPBOX");

        String provider;

        PROVIDER_NAME(String provider) {
            this.provider = provider;
        }

        public String getProvider() {
            return this.provider;
        }
    }

}
