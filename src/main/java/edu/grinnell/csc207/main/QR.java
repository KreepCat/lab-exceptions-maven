package edu.grinnell.csc207.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import edu.grinnell.csc207.util.IOUtils;
import edu.grinnell.csc207.util.Quadratic;

/**
 * Interactively compute quadratic roots.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class QR {
  /**
   * Do all the work.
   *
   * @param args
   *   Command-line arguments (ignored).
   *
   * @throws Exception
   *   If something goes wrong with the I/O or elsewhere.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    pen.println("Hi! I'm here to help you understand quadratic functions. \n");

    int a = IOUtils.readInt(pen, eyes, "Please enter a (the coefficient of the squared term): ");

    int b = IOUtils.readInt(pen, eyes, "Please enter b (the coefficient of the linear term): ");
    
    int c = IOUtils.readInt(pen, eyes, "Please enter c (the constant): ");

    Quadratic expression = new Quadratic(a,b,c);
    pen.printf("The smaller root of %s is %d. \n", expression.toString(), (int) expression.smallerRoot());
    
    pen.printf("Experimentally, %s = 0. \n", expression.toString((int) expression.smallerRoot()));
    eyes.close();
    pen.close();
  } // main(String[])

} // QR
