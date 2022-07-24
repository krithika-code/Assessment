public class CompareVersions {
	
	public static void main(String[] args) {
		System.out.println(compareVersion("1", "1"));
	}

	public static int compareVersion(String version1, String version2) {
		String subV1[] = version1.split("[.]");
		String subV2[] = version2.split("[.]");

		int len_v1 = subV1.length;
		int len_v2 = subV2.length;
		int i = 0;
		int j = 0;
		while (i < len_v1 || j < len_v2) {
			String x = "";
			String y = "";

			if (i < len_v1) {

				if (subV1[i].charAt(0) == '0') {
					int len = subV1[i].length();
					int k = 0;

					while (k < len && subV1[i].charAt(k) == '0') {
						k++;
					}
					x += subV1[i].substring(k);
				} else {
					x += subV1[i];
				}
			}

			if (j < len_v2) {
				if (subV2[i].charAt(0) == '0') {
					int len = subV2[i].length();
					int k = 0;

					while (k < len && subV2[i].charAt(k) == '0') {
						k++;
					}
					y += subV2[i].substring(k);
				} else {
					y = subV2[i];
				}
			}
			int res = compareSubstr(x, y);
			if (res != 0) {
				return res;
			}
			i++;
			j++;

		}
		return 0;
	}
	
	public static int compareSubstr(String subV1, String subV2) {
		int len_subV1 = subV1.length();
		int len_subV2 = subV2.length();
		int res;
		if (len_subV1 > len_subV2) {
			return 1;
		} else if (len_subV2 > len_subV1) {
			return -1;
		} else {
			res = subV1.compareTo(subV2);
		}
		if (res > 0) {
			return 1;
		} else if (res < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}