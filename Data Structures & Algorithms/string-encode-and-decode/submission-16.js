class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let encoded = [];

        for (const str of strs) {
            encoded.push(`${str.length}#${str}`);
        }

        return encoded.join("");
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let long = "";
        const res = [];

        for (let i = 0; i < str.length; i++) {
            if (str[i] !== "#") {
                long += str[i];
                continue;
            }

            let numericLong = Number(long);

            res.push(str.substring(i + 1, i + numericLong + 1));
            i += numericLong;
            long = "";
        }

        return res;
    }
}
