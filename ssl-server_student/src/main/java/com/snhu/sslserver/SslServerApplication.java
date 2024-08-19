package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
@RequestMapping("/hash")
class HashController {

    @GetMapping
    public String getChecksum() {
        String data = "Hello Engred Vanegas!";
        String algorithm = "SHA-256";
        String checksumHashValue = generateChecksum(data);
        return "Data: " + data + "<br/>Name of Cipher Algorithm Used: " + algorithm + "<br/>Checksum Hash Value: " + checksumHashValue;
    }

    private String generateChecksum(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(data.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            return "Error generating checksum";
        }
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}