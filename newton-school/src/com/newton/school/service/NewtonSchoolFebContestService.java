package com.newton.school.service;

public class NewtonSchoolFebContestService {

	public static int minSurfaceAreaOfCuboid(int volumeOfCubeboid) {
		int minSurfaceArea = 0;

		int y = (int) Math.cbrt(volumeOfCubeboid);
		// volume of cuboid = lwh
		// surface of cuboid = 2(lw+ lh+ wh)

		// vol = x^2*y;
		int x = 0;
		volumeOfCubeboid /= y;
		x = (int) Math.sqrt(volumeOfCubeboid);
		volumeOfCubeboid /= x;
		int z = volumeOfCubeboid;
		minSurfaceArea = 2 * (x * y + x * z + y * z);

		return minSurfaceArea;
	}

	public static int minSurfaceAreaOfCuboid2ndWay(int volumeOfCubeboid) {

		int i, j, k = 0;
		int area = 0;
		int min = Integer.MAX_VALUE;

		for (i = 1; i <= 1000000; i++) {
			for (j = 1; j <= 100; j++) {
				if (volumeOfCubeboid % (i * j) == 0) {
					k = volumeOfCubeboid / (i * j);
					area = 2 * (i * j + i * k + j * k);
					if (min > area) {
						min = area;
					}
				}
			}
		}
		return min;
	}
}
