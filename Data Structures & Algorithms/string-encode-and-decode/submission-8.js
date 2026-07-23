class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let encoded = ""

        for(const str of strs) {
            encoded += `${str.length}#${str}` 
        }
        
        console.log({ encoded })

        return encoded
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let long = "";
        const res = []

        for(let i = 0; i < str.length; i++) {
            if(str[i] === "#"){
                let numericLong = Number(long);

                console.log({ numericLong, long, sliced:  str.substring(i+1, i + numericLong + 1)})
                res.push(str.substring(i+1, i + numericLong + 1))
                long = ""
                i += numericLong;
                continue;
            }

            long += str[i];
        }

        return res;
    }
}
