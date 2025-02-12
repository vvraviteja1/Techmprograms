function rotateString(str, rotations) {
    let rotatedStr = str;
    for (let i = 0; i < rotations; i++) {
      const lastChar = rotatedStr.slice(-1);
      rotatedStr = lastChar + rotatedStr.slice(0, -1);
    }
    return rotatedStr;
  }
  const originalString = 'digiterati';
  const numRotations = originalString.length; 
  
  for (let i = 1; i <= numRotations; i++) {
    const rotated = rotateString(originalString, i);
    console.log(rotated);
  }