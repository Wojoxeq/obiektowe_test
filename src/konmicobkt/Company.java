/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konmicobkt;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Company {
    
    String companyName;
    Employee employees [];
    
    @Override
    public String toString() {
        return "Company: " + "companyName='" + companyName + '\'' + ", employees='" + Arrays.toString(employees) + '\'';
    }
}
