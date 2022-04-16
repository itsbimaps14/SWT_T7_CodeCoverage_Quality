package Main.Java;

import java.util.ArrayList;

public class CalcNUmberDifference {

	// fungsi mengembalikan nilai selisih antara nilai terbesar dan terkecil
	public int numberDiffirenceProcess(ArrayList<Integer> deretBil) {
		int difference = 0;
		int min, max, idxDeretBil;
		
		min = deretBil.get(0);
		max = deretBil.get(0);

		for (idxDeretBil = 1; idxDeretBil < deretBil.size(); idxDeretBil++) { 
			if (deretBil.get(idxDeretBil) < min)
				min = deretBil.get(idxDeretBil);
			if (deretBil.get(idxDeretBil) > max)
				max = deretBil.get(idxDeretBil);
		}
		
		difference = max - min;
		
		return difference;
	}
	
	// fungsi mengembalikan jenis grup berdasarkan nilai selisih nilai terbesar dan terkecil
	// kelompok “Small Difference” untuk selisih berada di antara 1-10 
	// kelompok “Medium Difference” untuk selisih berada di antara 11-50
	// kelompok “Large Difference” untuk selisih berada di antara > 50
	// kelompok “There’s no difference” untuk selisih 0 atau tidak memiliki selisih, yaitu nilai terkecil = terbesar
	public String groupingDifference(int diff) {
		String message;
		int group;
		
		message = "Difference : " + diff; 
		if(diff>50) {
			group = 3;
		}else if(diff>=11 && diff<50) { 
			group = 2;
		}else if(diff>=1 && diff<10){ 
			group = 1;
		}else {
			group = 0;
		}
		
		if(group>0){
			message = message + "\nGroup " + group + ", ";
		}else{
                        // Bug Fix !! - Bima Putra
                        // Before : message = message + "\nNon Group ";
                        // After : message = message + "\nNon Group, ";
                        /* Keterangan :
                            Message tidak sesuai dengan requirement.
                        */
			message = message + "\nNon Group, ";
		}
		
		switch(group) {
                        // Bug Fix !! - Sabar M Itikap
                        // Before : case 1: message = message + "Small Difference";
                        // After : case 1: message = message + "Small Difference"; break;
                        /* Keterangan :
                            Kondisi case 2 akan masuk ke case 1 jika tidak ada break
                        */
			case 1: message = message + "Small Difference"; break;
			case 2: message = message + "Medium Difference"; break;
                        // Bug Fix !! - Bima Putra & Sabar M Itikap
                        // Before : case 1: message = message + "Small Difference";
                        // After : case 1: message = message + "Small Difference"; break;
                        /* Keterangan :
                            Terdapat kesalahan output, kurang huruf "n"
                        */
			case 3: message = message + "Large Difference"; break;
                        // Bug Fix !! - Bima Putra
                        // Before : case = 4
                        // After : case = 0
                        /* Keterangan :
                            Kondisi ketika difference < 1 case 0
                        */
			case 0: message = message + "There's no difference"; break;
		}
		
		return message;
	}
	
	// function validasi nilai N sesuai dengan range valid, yaitu N berada pada range 1-10
	// mengembalikan true, jika nilai N sesuai dengan range
	// // sebaliknya mengembalikan false
	public boolean validateRangeInputMaxDeret(int nBil) {
                // Bug Fix !! - Bima Putra
                // Before : if(nBil>=1 || nBil<=10)
                // After : if(nBil>=1 && nBil<=10)
                /* Keterangan :
                    Salahnya operasi or di sini buat angka diluar 
                    boundary tetep true. Ubah operasi menjadi and.
                */
		if(nBil>=1 && nBil<=10) { 
			return true;
		}else {
			return false;
		}
	}
}
