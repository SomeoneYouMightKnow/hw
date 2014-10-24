public int[] frontPiece(int[] nums) {
    if (nums.length > 1) {
	int[] a = {nums[0], nums[1]};
	return a;
    }
    else {
	if (nums.length >0){
	    int[] a = {nums[0]};
	    return a;
	}
	else {
	    int[] a = {};
	    return a;
	}
    }
}

public int sum13(int[] nums) {
    int sum = 0;
    if (nums.length > 0) {
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 13) {
		sum = sum + nums[i];
	    }
	    else {
		i++;
	    }
	}
    }
    else {
	return sum;
    }
    return sum;
}
