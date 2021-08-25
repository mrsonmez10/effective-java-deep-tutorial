package com.effectivejava.tutorial.effectivejava.itema69toRestOfCapter10;

public class IncorrectFileExtensionException extends RuntimeException {
	
  // Unchecked
  public IncorrectFileExtensionException(String errorMessage, Throwable err) {
      super(errorMessage, err);
  }
  

  /*
  try (Scanner file = new Scanner(new File(fileName))) {
	    if (file.hasNextLine()) {
	        return file.nextLine();
	    } else {
	        throw new IllegalArgumentException("Non readable file");
	    }
	} catch (FileNotFoundException err) {
	    if (!isCorrectFileName(fileName)) {
	        throw new IncorrectFileNameException( "Incorrect filename : " + fileName , err);
	    }
	    
	    //...
	} catch(IllegalArgumentException err) {
	    if(!containsExtension(fileName)) {
	        throw new IncorrectFileExtensionException(
	          "Filename does not contain extension : " + fileName, err);
	    }
	    
	    //...
	}
   */
  
}